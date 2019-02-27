package javaproject;


import java.util.ArrayList;
import javaproject.Knt;
import javaproject.Coup;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author The Phoenix
 */
public final class TableUsingArrayList {

    private int id;
    private String schoolName;
    private String cityName1;
    private String boardName2;
    Knt Knt;
    
    ArrayList<schoolDetail> theList;
    Coup viewMenu;
    private Coup Coup;

    
    
    public TableUsingArrayList(Knt knt) {
        this.Knt= knt;
        
        theList = new ArrayList<>();
        addToTable();
    }
    
    public TableUsingArrayList(Coup collegeUpdate) {
        this.Coup =collegeUpdate;
       
        theList = new ArrayList<>();
        addToTable2();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getscid() {
        return schoolName;
    }

    public void setscid(String scid) {
        this.schoolName = scid;
    }

    public String getCityName1() {
        return cityName1;
    }

    public void setCityName1(String cityName1) {
        this.cityName1 = cityName1;
    }
    
    public String getBoardName2() {
        return boardName2;
    }

    public void setBoardName2(String boardName2) {
        this.boardName2 = boardName2;
    }

    public void scli() {
        
        theList.add(new schoolDetail(1, "R.K.V.V.","Kolkata", "C.B.S.E."));
        theList.add(new schoolDetail(2, "S.R. Public School","Kota", "C.B.S.E."));
        theList.add(new schoolDetail(3, "Jay Jyoti","Guna", "C.B.S.E."));
        theList.add(new schoolDetail(4, "Sarswati","Bhopal", "M.P."));
        theList.add(new schoolDetail(5, "D.P.S.","Delhi", "ICSE"));
    }

    public void addToTable() {
        scli();
        DefaultTableModel model = (DefaultTableModel) Knt.foodTableDisplay.getModel();
        
        
        
        for (int i = 0; i < theList.size(); i++) {
            Object rowData[] ={theList.get(i).getID(),theList.get(i).getName(),theList.get(i).getName1(),theList.get(i).getName2(),theList.get(i)};
            model.addRow(rowData);
        }
           }

    public void addToTable2() {
        scli();
        DefaultTableModel model2 = (DefaultTableModel) viewMenu.Coupdate.getModel();
      
        
        
        for (int i = 0; i < theList.size(); i++) {
            Object rowData[] ={theList.get(i).getID(),theList.get(i).getName(),theList.get(i).getName1(),theList.get(i).getName2(),theList.get(i)};
            model2.addRow(rowData);
        }
        
    }

    

    
    private class schoolDetail {
        int id;
        String name;
        String name1;
        String name2;

        schoolDetail(int id, String schoolName, String cityName1, String boardName2) {
            this.id = id;
            this.name = schoolName;
            this.name1 = cityName1;
            this.name2 = boardName2;
        }

        int getID() {
            return this.id;
        }

        String getName() {
            return name;
        }

        String getName1() {
            return name1;
        }
        
        String getName2() {
            return name2;
        }

        

        
    }

}
