package com.example.a9.entity;

public class AccountItem {

    private int id;
    private  String category;
    private String remark;
    private  double money;
    private String date;

    public AccountItem(int id,String category,String remark,double money,String date){
        this.id=id;
        this.category=category;
        this.remark=remark;
        this.money=money;
        this.date=date;
    }


    public AccountItem(){

    }
    public AccountItem(String category,String remark,double money,String date){
        this.category=category;
        this.remark=remark;
        this.money=money;
        this.date=date;
    }

    public  void setId(int id){
        this.id=id;
    }
    public  void setCategory(String category){
        this.category=category;
    }

    public  void setRemark(String remark){
        this.remark=remark;
    }
    public  void setMoney(double money){
        this.money=money;
    }
    public  void setDate(String date){
        this.date=date;
    }


    public  int getId(){
        return id;
    }
    public  String getCategory(){
        return category;
    }

    public  String getRemark(){
        return remark;
    }
    public  double getMoney(){
        return money;
    }
    public  String getDate(){
        return date;
    }
    @Override
    public String toString(){
        return  "AccountItrm{"+
                "id="+id+
                ",category='"+category+'\''+
                ",remark='"+remark+'\''+
                ",money="+ money +
                ",date='"+date+'\''+
                '}';
    }
}
