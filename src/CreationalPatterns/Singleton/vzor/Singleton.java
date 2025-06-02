package CreationalPatterns.Singleton.vzor;

public class Singleton {
//pouziva sa pri multithread app , cize swing kniznice(Jlabel,Jframe, listenery atd ...)
    private static volatile Singleton instance;
    private String data;

    private Singleton(String data) {
        this.data = data;
    }
//double check metoda
    public static Singleton getInstance(String data) {

      if(instance == null) {
       synchronized (Singleton.class) {

           if (instance == null) {
               instance = new Singleton(data);
            }
        }
      }
      return instance;
    }
    //popripade mozes pouzit

    public class ThreadSafeSingleton {
        private static ThreadSafeSingleton instance;

        private ThreadSafeSingleton() {}

        public static synchronized ThreadSafeSingleton getInstance() {
            if (instance == null) {
         //       instance =new ThreadSafeSingleton();     komentar len preto lebo mi ukazuje chybu
            }
            return instance;
        }
    }




    ////////////////////keby daco pozri priecinok


    //keby mame nejaku SINGLETHREAD aplication tak pouzijeme toto
    //typicky je to nejaky bezny main


//    public static CreationalPatterns.Singleton.CreationalPatterns.Singleton getInstance(String data) {
//        if(instance == null) {
//            instance = new CreationalPatterns.Singleton.CreationalPatterns.Singleton(data);
//        }
//        return instance;
//    }

}
