package nifax.control.controller;

import nifax.control.model.modeler.HQLOperation;

/**
 *
 * @author faka
 */
public class CodeGenerator extends HQLOperation{
    private final String PRODUCTSEQUENCE = "product_product_id_seq";
    private String code;
    
    public CodeGenerator(String code){
        this.code = code;
    }
    public String createCode(final String SequenceValue){
        String result = code.substring(0, 2);
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
        return getSequenceValue(PRODUCTSEQUENCE);
    }
    
    public String getSequenceValue(final String SequenceName){
        return String.format("%05d", Integer.
            parseInt(
                HQLOperation.
                getInstance().
                getNextSequenceValue(SequenceName).
                toString()
            )
        );
    }
}
