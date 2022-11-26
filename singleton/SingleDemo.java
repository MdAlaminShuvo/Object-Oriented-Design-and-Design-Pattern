public class SingleDemo{

    public static void main(String[] args){
        SingleObjectTest object = SingleObjectTest.getInstance();

        object.showMessage();
    }
}