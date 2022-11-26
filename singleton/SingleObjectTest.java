public class SingleObjectTest{

    private static SingleObjectTest instance; 

    private SingleObjectTest(){};

    public static SingleObjectTest getInstance(){
        if(SingleObjectTest.instance == null){
            SingleObjectTest.instance = new SingleObjectTest();
        }
        return SingleObjectTest.instance;
    }

    public void showMessage(){
        System.out.println("Hello Bangladesh");
    }

}