/* 
    if-else三种结构
    if(){

    }

    if(){

    }else{

    }

    if(){

    }else if(){

    }else if(){

    }else{

    }
*/
public class IfTest {
    public static void main(String[] args){
        int     heartBeats = 79;
        if(heartBeats < 60 || heartBeats > 100){
            System.out.println("需要做进一步检查");
        }else{
            System.out.println("检查结束");
        }
        int     age = 23;
        if(age < 0){
            System.out.println("您输入的数据有误");
        }
        else if(age < 18){
            System.out.println("你还没有成年");
        }else{
            System.out.println("你已经成年了");
        }
    }
}
