package cn.net.communion.dbdatasync.dbhelper;

import cn.net.communion.dbdatasync.dbhelper.impl.MySql;
import cn.net.communion.dbdatasync.dbhelper.impl.SqlServer;

public class Factory
{
  public static DbHelper create(String type)
  {
    if (type.toLowerCase().equals("sqlserver")) {
      return new SqlServer();
    }
    else if (type.toLowerCase().equals("mysql")){
      return new MySql();
    }
    return null;
  }
}
