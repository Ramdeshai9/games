import java.util.*;
class game1 
{
	public static void main(String[] args) 
	{
		System.out.println("1.missing words  \n2.jumbled words");
         System.out.println(" enter  number of game which you want to play");
          Scanner s=new Scanner(System.in);
         int m=s.nextInt();
         game1 g= new game1();
        switch(m)
         {
          case 1:  g.guessname();
                      break;
          case 2:   g.jumbled();
                       break;
          default: System.out.println("wrong entry");
         }

	}
void guessname()
{
String[] a= new String[]{"iprimed","program","welcome","book","laptop","cellphone","fullstack","internet","hospital","cards"};
List<String> nameList = new ArrayList<>(Arrays.asList(a));
int k=0;
 Collections.shuffle(nameList);
 for(String s:nameList)
{
   String abc=s;
   Random r=new Random();
   int n1=r.nextInt(abc.length());
   int n2=r.nextInt(abc.length());
   int n3=r.nextInt(abc.length());
  char [] ab= abc.toCharArray();
   int abs=ab.length;
   for(int i=0;i<abs;i++)
     {
       char ch = abc.charAt(i);
 
         if( i==n1 || i==n2 ||i==n3)
            ab[i]='*';
          else
            ab[i]=ch;
          }
        System.out.println(ab);
    
      System.out.println("enter correct word");
     Scanner scan=new Scanner(System.in);
      String g1=scan.next();
   if(nameList.contains(g1))
      k++;
}
 System.out.println("your guessed "+" "+k+" missing  words correct");
}
void jumbled()
{
String[] b= new String[]{"iprimed","program","welcome","book","laptop","cellphone","fullstack","internet","hospital","cards"}; 
List<String> nameLists = new ArrayList<>(Arrays.asList(b));
int k=0;
Collections.shuffle(nameLists);
 for(String s:nameLists)
{
   String abc=s;
   Random r=new Random();
   int n1=r.nextInt(abc.length());
   int n2=r.nextInt(abc.length());
   int n3=r.nextInt(abc.length());
  char [] ab= abc.toCharArray();
   int abs=ab.length;
 for(int i=0;i<abs;i++)
   {
        if( i==n1 || i==n2 ||i==n3)
            {
              char temp= ab[i];
                  ab[i]=ab[n1];
                 ab[n1]=temp;
              }
          
          }
        System.out.println(ab);
    
      System.out.println("enter correct word");
     Scanner scan=new Scanner(System.in);
      String g1=scan.next();
   if(nameLists.contains(g1))
      k++;
}

System.out.println("your guessed "+" "+k+" jumbled words correct");
}
}

 /* for(int i=0;i<abs;i++)
     {
       char ch = abc.charAt(i);
      }*/