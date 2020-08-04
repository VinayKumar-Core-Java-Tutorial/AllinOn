package com.usermanagement.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.usermanagement.DBconnect.UserConnect;
import com.usermanagement.model.UserParam;


public class UserCrud {

	public static int save(UserParam e){  
        int status=0;  
        try{  
            Connection con=UserConnect.getConnection(); 
            
            PreparedStatement ps=con.prepareStatement(  
                         "insert into users(uname,upwd,uemail,fcheck,fname,fpwd,gcheck,gname,gpwd,firstname,lastname,uniqueid) values (?,?,?,?,?,?,?,?,?,?,?,?)");  
            ps.setString(1,e.getUname());  
            ps.setString(2,e.getUpwd()); 
            ps.setString(3,e.getUemail()); 
            ps.setString(4,e.getFcheck());
            ps.setString(5, e.getFname());
            ps.setString(6, e.getFpwd());
            ps.setString(7, e.getGcheck());
            ps.setString(8,e.getGname());
            ps.setString(9, e.getGpwd());
            ps.setString(10, e.getFirstname());
            ps.setString(11,e.getLastname());
            ps.setString(12,e.getUniqueid());
                          
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    } 
	
	
	public static UserParam getUserById(int id){  
		UserParam e=new UserParam();  
          
        try{  
            Connection con=UserConnect.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from Users where id=?");  
            ps.setInt(1,id);  
           
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){  

                e.setId(rs.getInt(1)); 
//                e.setUname(rs.getString(2));  
//                e.setUpwd(rs.getString(3)); 
                e.setUemail(rs.getString(4));
                e.setFcheck(rs.getString(5));
                e.setFname(rs.getString(6)); 
                e.setFpwd(rs.getString(7));  
                e.setGcheck(rs.getString(8));
                e.setGname(rs.getString(9)); 
                e.setGpwd(rs.getString(10));

                 
            }  
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
            
        return e;  
    }  
	
	 public static int update(UserParam e){  
	        int status=0;  
	        try{  
	            Connection con=UserConnect.getConnection();  
	            PreparedStatement ps=con.prepareStatement(  
	                         "update Users set uname=?,upwd=?,uemail=? where id=?"); 
	            ps.setString(1,e.getUname());  
	            ps.setString(2,e.getUpwd()); 
	            ps.setString(3,e.getUemail());  
	            ps.setInt(4,e.getId());  
	              
	            status=ps.executeUpdate();  
	              
	            con.close();  
	        }catch(Exception ex){ex.printStackTrace();}  
	          
	        return status;  
	    }  
	 public static int delete(int id){  
	        int status=0;  
	        try{  
	            Connection con=UserConnect.getConnection();  
	            PreparedStatement ps=con.prepareStatement("delete from Users where id=?");  
	            ps.setInt(1,id);  
	            status=ps.executeUpdate();  
	              
	            con.close();  
	        }catch(Exception e){e.printStackTrace();}  
	          
	        return status;  
	    }  
	 
	public static int addLinkValues(UserParam e){  
        int status=0;  
        try{  
            Connection con=UserConnect.getConnection();  
            PreparedStatement ps=con.prepareStatement("Update Users set fcheck=?, fname=?, fpwd=?, gcheck=?, gname=?, gpwd=? where id=?");   
            
            ps.setString(1,e.getFcheck());  
            ps.setString(2,e.getFname()); 
            ps.setString(3,e.getFpwd());  
            ps.setString(4,e.getGcheck());  
            ps.setString(5,e.getGname()); 
            ps.setString(6,e.getGpwd());  
            ps.setInt(7,e.getId()); 
            
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    } 
	
	public static int changepwd(UserParam e){  
        int status=0;  
        try{  
            Connection con=UserConnect.getConnection();  
            System.out.print(e.getUniqueid());
            PreparedStatement ps=con.prepareStatement(  
                         "update Users set upwd=? where uniqueid=?"); 
            ps.setString(1,e.getUpwd());  
            ps.setNString(2, e.getUniqueid());
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    } 
	
	public static int deleteLinkValues(UserParam e){  
        int status=0;  
        try{  
            Connection con=UserConnect.getConnection();  
            PreparedStatement ps=con.prepareStatement("Update Users set fcheck=?, gcheck=? where id=?");   
            
            ps.setString(1,e.getFcheck());  
  
            ps.setString(2,e.getGcheck());  
   
            ps.setInt(3,e.getId()); 
            
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    } 
    
}
