package Calculator;

public class JavaProgramMain {

    public static void main(String[] args) {
         JavaProgramStart ps =new JavaProgramStart();
         JavaProgramLogin login = new JavaProgramLogin();
        if (JavaProgramLogin.loginSuccesful()){
         ps.runProgram();
    }
}
