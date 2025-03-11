
package com.mycompany.project.xo;


public class Board implements BoardInterface {
    public char [][]arr;

    public Board() {
        this.arr = new char[][]{{'1','2','3'},{'4','5','6'},{'7','8','9'}};
    }
    
    //Methods
    public int getRow(int indx){
        return (indx-1)/3;
    }
    public int getCol(int indx){
        return (indx-1)%3 ;
    }
    public boolean isEmp(int indx){
        int r=getRow(indx);
        int c=getCol(indx);
        
        if(arr[r][c]=='X' || arr[r][c]=='O'){
            return false;
        }
        else{
            return true;
        }
    }
    public boolean repChar(int indx, Player p){
        if(isEmp(indx)){
           int r=getRow(indx);
           int c=getCol(indx);
           
           arr[r][c]=p.getOp();
           return true;
        }
 
           return false;
    }
    public void draw(){
        System.out.println("-----------");
        for(int i=0; i<3; i++){
            for(int j =0; j<3; j++){
               System.out.print("|"+ arr[i][j]+" ");
            }  
            System.out.println("|");
            System.out.println("-----------");
        }
        
    }
    public boolean isFull(){
       int count=0;
       for(int i=1; i<=9; i++){
           if(isEmp(i)){
             count++;
           }
       }
       if(count==0){
           return true;
       }
       else{
           return false;
       }
    }
    @Override
    public boolean isWin(Player p){
       if(arr[0][0]==arr[0][1] && arr[0][1]==arr[0][2]){
           return true;
       }
        if(arr[1][0]==arr[1][1] && arr[1][1]==arr[1][2]){
           return true;
       }
         if(arr[2][0]==arr[2][1] && arr[2][1]==arr[2][2]){
           return true;
       }
          if(arr[0][0]==arr[1][0] && arr[1][0]==arr[2][0]){
           return true;
       }
           if(arr[0][1]==arr[1][1] && arr[1][1]==arr[2][1]){
           return true;
       }
            if(arr[0][2]==arr[1][2] && arr[1][2]==arr[2][2]){
           return true;
       }
             if(arr[0][0]==arr[1][1] && arr[1][1]==arr[2][2]){
           return true;
       }
              if(arr[0][2]==arr[1][1] && arr[1][1]==arr[2][0]){
           return true;
       }
       return false;
    }
    
}
