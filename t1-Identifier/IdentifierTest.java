/* 
    标识符
        由26个英文大小写字母、0-9、下划线、$组成
        数字不能开头
        不可以使用关键字、保留字，但可以包含
        标识符不能包含空格
    命名规范
        包名：多单词组成时所有字母都小写：xxxyyyzzz
        类名、接口名：所有单词首字母大写：XxxYyyZzz（大驼峰）
        变量名、方法名：第一个单词小写，后面单词首字母大写：xxxYyyZzz（小驼峰）
        常量名：全部大写，单词间用下划线：XXX_YYY_ZZZ
*/
public class IdentifierTest {
    public static void main(String[] args){
        int myNumber = 1001;
        System.out.println(myNumber);
        //可以使用中文，但是不推荐
        int 学号 = 1003;
        System.out.println(学号);
    }
}
class Hello_1${

}