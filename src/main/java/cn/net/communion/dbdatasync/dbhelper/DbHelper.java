package cn.net.communion.dbdatasync.dbhelper;

import java.sql.Connection;
import java.sql.SQLException;

import cn.net.communion.dbdatasync.entity.JobInfo;

public interface DbHelper {
	public String assembleSQL(String paramString, Connection paramConnection, JobInfo paramJobInfo)
		    throws SQLException;
	public void executeSQL(String sql, Connection conn)
		    throws SQLException;

}
