//подсчет количества знаков в строке


public class countSTR 
{
  public static void main(String[] args) 
    {
      String duplicate= new String("aaaaaaaabbcccccwwwwa");
      int count=0;
      int lenName=0;
        do
        {  
          try
          {
          char name[]=duplicate.toCharArray();         
             
          count=0;
              
          for(int i=0;i<lenName;i++)
               {
              if(name[0]==name[i])
                      count++;
               }
              if(count!=0)
                System.out.print(name[0]+""+count+" ");
              duplicate=duplicate.replace(""+name[0],"");          
          }
          catch(Exception ex){}
        }
        while(lenName!=1);
   }

}
