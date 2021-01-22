public class Exercise_String {
    
    public static void main(String[] args){
        //练习1
        char c = 'a';   //97
        int num = 10;
        String str = "hello";
        System.out.println(c + num + str);//107hello
        System.out.println(c + str + num);//ahello10
        System.out.println(c + (num + str));//a10hello
        System.out.println((c + num) + str);//107hello
        System.out.println(str + num + c);//hello10a
        //练习2
        //输出*     *
        System.out.println("*       *");
        System.out.println('*' + '\t' + '*');//93
        System.out.println('*' + "\t" + '*');
        System.out.println('*' + '\t' + "*");//51*
    }
    
}
