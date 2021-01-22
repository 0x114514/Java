import javax.print.event.PrintServiceAttributeListener;

/* 
    二进制      0b开头
    八进制      0开头
    十进制      
    十六进制    0x开头
*/
public class VeriableBase {
        public static void main(String[] args){
            int num1 = 0b110;
            int num2 = 110;
            int num3 = 0127;
            int num4 = 0x110A;
            System.out.println("num1 = " + num1 + "\nnum2 = " + num2 + "\nnum3 = " + num3 + "\nnum4 = " + num4);
        }
    
}
