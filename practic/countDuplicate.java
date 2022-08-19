/**Сделать программу, в рамках которой необходимо определить какой символ 
 * сколько раз встречается в строке. 
 * Например: входящая строка вида - "aaaaabbbbcddd" мы должны получить - "a5b4c1d3".*/

import java.io.*;
public class countDuplicate
{

    public static void main(String[] args) throws IOException
    {
      
      String duplicate = "aaaaabbbbcddd";
      int count=0,len=0;
        do
        {  
          try
          {
          char name[]=duplicate.toCharArray();
              len=name.length;
              count=0;
              for(int i=0;i<len;i++)
               {
                  if((name[0]==name[i])) 
                      count++;
               }
              if(count!=0)
                System.out.print(name[0]+""+count+" ");
              duplicate=duplicate.replace(""+name[0],"");          
          }
          catch(Exception ex){}
        }
        while(len!=1);
   }

}