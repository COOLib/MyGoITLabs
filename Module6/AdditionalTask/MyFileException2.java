/**
 * Created by COOLib on 05.01.2016.
 */
public class MyFileException2 extends Exception{

        private String nameOfFile;

        public MyFileException2(String name){
            this.nameOfFile = name;
        }

        public String getNameOfFile(){
            return nameOfFile;
        }
}
