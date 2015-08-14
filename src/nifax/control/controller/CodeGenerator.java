package nifax.control.controller;

import nifax.control.model.modeler.HQLOperation;

/**
 *
 * @author faka
 */
public class CodeGenerator extends HQLOperation{
    private final String PRODUCTSEQUENCE = "product_product_id_seq";
    private final String code;
    
    public CodeGenerator(String code){
        this.code = code;
    }
    public String createCode(final String SequenceValue){
        String result = code.substring(0, 2).toUpperCase();
        result = result + SequenceValue;
        return result;
    }
    
    public String createProductCode(){
        return createCode(getSequenceProduct());
    }
    
    public String getCode(){
        return code;
    }
    
    public String getSequenceProduct(){        
        return formatSequenceValue(getSequenceValue(PRODUCTSEQUENCE));
    }
    
    public String formatSequenceValue(Integer sequence){
        return String.format("%05d", Integer.
            parseInt(
                sequence.toString()
            )
        );
    }
    
    public Integer getSequenceValue(final String SequenceName){
        return HQLOperation.
                getInstance().
                getNextSequenceValue(SequenceName);
    }
}
