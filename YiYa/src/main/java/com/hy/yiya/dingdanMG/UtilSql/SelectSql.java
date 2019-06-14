package com.hy.yiya.dingdanMG.UtilSql;

import com.hy.yiya.huiyuanMG.entity.Huiyuan;

public class SelectSql {
   public String queryAll(Huiyuan huiyuan){
      StringBuffer stringBuffer=new StringBuffer();
      stringBuffer.append("select * from huiyuan where 1=1");
      if(null != huiyuan && !"".equals(huiyuan)){
         if(null != huiyuan.getName() && !"".equals(huiyuan.getName())){
            stringBuffer.append(" and name like '%"+huiyuan.getName()+"%'");
         }if (null != huiyuan.getPhone() && !"".equals(huiyuan.getPhone())){
            stringBuffer.append(" and phone like '%"+huiyuan.getPhone()+"%'");
         }
      }
      return stringBuffer.toString();
   }
}
