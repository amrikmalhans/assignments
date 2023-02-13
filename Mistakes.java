public class Mistakes {
    public static void first(String[] args) {
        System.out.println("Amrik Malhans's playing around program.");
        System.out.println("2+2 equals " + 2 + 2);

        System.out.println("Whut iz in .printlyn duzznt haf 2 bee write");
    }
}

// Questions and Answers:

// 1). change the “+ (2 + 2) )” to “+ 2 + 2 )” (remove the inner ( ) ), why is
// the
// output different?
// Ans. The output would now be 22 instead of 4. This is because the inner
// parentheses are used to specify the order of operations. Without them, the
// expression would be evaluated from left to right, which would be "2+2 equals
// "
// + 2 + 2, which equals 22 (because the + operator is now being used to
// concatenate)

// 2). rename the main() method, to first() – does the program Compile? does the
// program Run?
// The program would not run because the main method is the entry point of a
// Java program. The JVM looks for the main method with the signature "public
// static void main(String[] args)" to begin execution of the program. So
// renaming the main method would cause the program to not run.

// 3). remove the keyword public in front of main() – does it compile? does it
// run?
// It will not compile, because the main method must be public in order for the
// JVM to access and execute it.

// 4). So, what is the difference between a “compiler syntax error” and a
// “run-time
// error?”
// A compiler syntax error occurs when the code does not follow the syntax
// rules of the programming language, and is detected by the compiler (you can
// usually it in your IDE). A run-time error occurs when the code is
// syntactically correct, but an error occurs during execution of the program.
// (You can usually see it in the console).

// 5). change the S in String[] args to s (lowercase) – does it compile? what is
// the
// error message?
// Ans. It will not compile. The error message would be "cannot find symbol -
// variable args" because String is a class and in Java classes are always
// capitalized.

// 6). change the S in the first Systerm.out.println () statement to s
// (lowercase) –
// does it compile? what is the error message? is the error the same as when
// String was mistyped?
// Ans. It will not compile. The error message would be "error: package system
// does not exist". This is because the package name is case-sensitive.

// 7). remove the right-most " from the last .println() statement – does it
// compile?
// what is the error message?
// Ans. It will not compile. The error message would be "Unclosed string
// literal".

// 8). the spelling mistakes in the string ("Whut...write") do not affect the
// program…when does Java care about “spelling?”
// Ans. Programming languages (including Java) only care about spelling when it
// comes to keywords, variable and
// method
// names, etc. Strings are just a sequence of characters which does not affect
// programs in any way. They are used to store data. (which could be anything).
