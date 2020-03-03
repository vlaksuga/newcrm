package kr.vlaksuga.oms.api;

public class CResult extends CMap{
    CMap head = new CMap();

    public void setStatus(String code){
        this.head.put("code",code);
    }

    public void setMsg(String msg){
        this.head.put("msg",msg);
    }
    public void setHead(String key,String value){
        this.head.put(key,value);
    }

    public CMap getHead(){
        return this.head;
    }


}
