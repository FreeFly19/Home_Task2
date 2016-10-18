
public class eight_task {
    public static void main(String[] args) {
        for (int x=1;x<11;x++)
        {System.out.println(" ");
            for(int y =1;y<11;y++){
                int b;
                b= y*y;
                int c = y*x;

                if ( b>c){
                    System.out.print("# ");

                } else{
                    System.out.print(c+" ");
                }
            }
        }
    }
    }

