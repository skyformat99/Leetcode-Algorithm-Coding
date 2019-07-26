public interface B extends A{

    default  void  tacking(){
        System.out.println("-> B");
    }
}
