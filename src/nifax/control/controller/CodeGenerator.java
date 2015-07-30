package nifax.control.controller;

import nifax.control.model.modeler.HQLOperation;

/**
 *
 * @author faka
 */
public class CodeGenerator extends HQLOperation{
    
    private String code;
    private final int id;
    
    public CodeGenerator(String code, int id){
        this.code = code;
        this.id = id;
    }
    public void setCode(){
        String result = code.substring(0, 1);
        result = result + getSecuenceProduct();
        this.code = result;
    }
    
    public String getCode(){
        return code;
    }
    
    public String getSecuenceProduct(){        
        return String.format("%05d", SelectUnique("select nextval('public.\"product_product_id\"'"));        
    }
}
