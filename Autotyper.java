
package autotyper;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 *  
 * @author King
 */
public class Autotyper {

    public static void main(String[] args) throws FileNotFoundException, AWTException, InterruptedException {
        System.out.println("Click the code editor using your mouse cursor.... The program starts with in 10 seconds");
        Thread.sleep(5000);
        FileInputStream file = new FileInputStream("D:\\Learning Module\\First.txt"); // Replace this path by your reference file path
        Scanner sc = new Scanner(file);
        int open=0;
        int linenumber=1;
        int milliseconds = 20;  // Recommended 20 or above 20
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println(linenumber+"--> "+line);
            Robot rb= new Robot();
            int isFirstSpace=1;
            for(int i=0;i<line.length();i++){
                if(isFirstSpace==1){
                    if(line.charAt(i)==' ' || (int)line.charAt(i)==9) continue;
                }
                if((int)line.charAt(i)==9){
                    Thread.sleep(milliseconds);
                    rb.keyPress(Keycode(' '));
                    rb.keyRelease(Keycode(' '));
                    Thread.sleep(milliseconds);
                }
                else if(line.charAt(i)=='!' || line.charAt(i)=='@' || line.charAt(i)=='#' || line.charAt(i)=='$' || 
                   line.charAt(i)=='%' || line.charAt(i)=='^' || line.charAt(i)=='&' || line.charAt(i)=='*' || 
                   line.charAt(i)=='(' || line.charAt(i)==')' || line.charAt(i)=='_' || line.charAt(i)=='+' ||
                   line.charAt(i)=='{' || line.charAt(i)=='}' || line.charAt(i)=='|' || line.charAt(i)==':' || 
                   line.charAt(i)=='"' || line.charAt(i)=='<' || line.charAt(i)=='>' || line.charAt(i)=='?' || line.charAt(i)=='~' )
                {
                    rb.keyPress(KeyEvent.VK_SHIFT);
                    Thread.sleep(milliseconds);
                    rb.keyPress(Keycode(line.charAt(i)));
                    rb.keyRelease(Keycode(line.charAt(i)));
                    Thread.sleep(milliseconds);
                    rb.keyRelease(KeyEvent.VK_SHIFT);
                }
                else if(Character.isAlphabetic(line.charAt(i))){
                    if(Character.isUpperCase(line.charAt(i))){
                        rb.keyPress(KeyEvent.VK_SHIFT);
                        Thread.sleep(milliseconds);
                        rb.keyPress(Keycode(line.charAt(i)));
                        rb.keyRelease(Keycode(line.charAt(i)));
                        Thread.sleep(milliseconds);
                        rb.keyRelease(KeyEvent.VK_SHIFT);
                    }
                    else{
                        Thread.sleep(milliseconds);
                        rb.keyPress(Keycode(Character.toUpperCase(line.charAt(i))));
                        rb.keyRelease(Keycode(Character.toUpperCase(line.charAt(i))));
                        Thread.sleep(milliseconds);
                    }
                }
                else{
                    Thread.sleep(milliseconds);
                    rb.keyPress(Keycode(line.charAt(i)));
                    rb.keyRelease(Keycode(line.charAt(i)));
                    Thread.sleep(milliseconds);
                }
                if(line.charAt(i)=='\"' || line.charAt(i)=='\''){
                    if(open==1) open=0;
                    else open=1;
                }
                if(line.charAt(i)=='\"' || line.charAt(i)=='\''){
                    Thread.sleep(milliseconds);
                    rb.keyPress(KeyEvent.VK_DELETE);
                    rb.keyRelease(KeyEvent.VK_DELETE);
                    Thread.sleep(milliseconds);
                }
                if(line.charAt(i)=='(' || line.charAt(i)=='['){
                    if(open==0){
                        Thread.sleep(milliseconds);
                        rb.keyPress(KeyEvent.VK_DELETE);
                        rb.keyRelease(KeyEvent.VK_DELETE);
                        Thread.sleep(milliseconds);
                    }
                } 
                isFirstSpace=0;
            }
            Thread.sleep(milliseconds);
            rb.keyPress(KeyEvent.VK_SPACE);
            rb.keyRelease(KeyEvent.VK_SPACE);
            Thread.sleep(milliseconds);
            rb.keyPress(KeyEvent.VK_ENTER);
            rb.keyRelease(KeyEvent.VK_ENTER);
            linenumber++;
        }
    }
    static int Keycode(char ch){
        
        if(ch=='`') return KeyEvent.VK_BACK_QUOTE;
        if(ch=='~') return KeyEvent.VK_BACK_QUOTE;
        if(ch=='1') return KeyEvent.VK_1;
        if(ch=='!') return KeyEvent.VK_1;
        if(ch=='2') return KeyEvent.VK_2;
        if(ch=='@') return KeyEvent.VK_2;
        if(ch=='3') return KeyEvent.VK_3;
        if(ch=='#') return KeyEvent.VK_3;
        if(ch=='4') return KeyEvent.VK_4;
        if(ch=='$') return KeyEvent.VK_4;
        if(ch=='5') return KeyEvent.VK_5;
        if(ch=='%') return KeyEvent.VK_5;
        if(ch=='6') return KeyEvent.VK_6;
        if(ch=='^') return KeyEvent.VK_6;
        if(ch=='7') return KeyEvent.VK_7;
        if(ch=='&') return KeyEvent.VK_7;
        if(ch=='8') return KeyEvent.VK_8;
        if(ch=='*') return KeyEvent.VK_8;
        if(ch=='9') return KeyEvent.VK_9;
        if(ch=='(') return KeyEvent.VK_9;
        if(ch=='0') return KeyEvent.VK_0;
        if(ch==')') return KeyEvent.VK_0;
        if(ch=='-') return KeyEvent.VK_MINUS;
        if(ch=='_') return KeyEvent.VK_MINUS;
        if(ch=='=') return KeyEvent.VK_EQUALS;
        if(ch=='+') return KeyEvent.VK_EQUALS;
        
        if(ch=='Q') return KeyEvent.VK_Q;
        if(ch=='W') return KeyEvent.VK_W;
        if(ch=='E') return KeyEvent.VK_E;
        if(ch=='R') return KeyEvent.VK_R;
        if(ch=='T') return KeyEvent.VK_T;
        if(ch=='Y') return KeyEvent.VK_Y;
        if(ch=='U') return KeyEvent.VK_U;
        if(ch=='I') return KeyEvent.VK_I;
        if(ch=='O') return KeyEvent.VK_O;
        if(ch=='P') return KeyEvent.VK_P;
        if(ch=='A') return KeyEvent.VK_A;
        if(ch=='S') return KeyEvent.VK_S;
        if(ch=='D') return KeyEvent.VK_D;
        if(ch=='F') return KeyEvent.VK_F;
        if(ch=='G') return KeyEvent.VK_G;
        if(ch=='H') return KeyEvent.VK_H;
        if(ch=='J') return KeyEvent.VK_J;
        if(ch=='K') return KeyEvent.VK_K;
        if(ch=='L') return KeyEvent.VK_L;
        if(ch=='Z') return KeyEvent.VK_Z;
        if(ch=='X') return KeyEvent.VK_X;
        if(ch=='C') return KeyEvent.VK_C;
        if(ch=='V') return KeyEvent.VK_V;
        if(ch=='B') return KeyEvent.VK_B;
        if(ch=='N') return KeyEvent.VK_N;
        if(ch=='M') return KeyEvent.VK_M;   
         
        if(ch=='[') return KeyEvent.VK_OPEN_BRACKET;
        if(ch=='{') return KeyEvent.VK_OPEN_BRACKET;
        if(ch==']') return KeyEvent.VK_CLOSE_BRACKET;
        if(ch=='}') return KeyEvent.VK_CLOSE_BRACKET;
        if(ch=='\\') return KeyEvent.VK_BACK_SLASH;
        if(ch=='|') return KeyEvent.VK_BACK_SLASH;
        if(ch==';') return KeyEvent.VK_SEMICOLON;
        if(ch==':') return KeyEvent.VK_SEMICOLON;
        if(ch=='\'') return KeyEvent.VK_QUOTE;
        if(ch=='"') return KeyEvent.VK_QUOTE;
        if(ch==',') return KeyEvent.VK_COMMA;
        if(ch=='<') return KeyEvent.VK_COMMA;
        if(ch=='.') return KeyEvent.VK_PERIOD;
        if(ch=='>') return KeyEvent.VK_PERIOD;
        if(ch=='/') return KeyEvent.VK_SLASH;
        if(ch=='?') return KeyEvent.VK_SLASH;
        if(ch==' ') return KeyEvent.VK_SPACE;
        
        return 0;
    }     
}
