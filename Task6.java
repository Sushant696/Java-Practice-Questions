// **6. Design and implement a Java program that simulates the undo feature of a text editor using a stack. The program should support adding text to the editor and undoing changes. 
// The stack should store strings, each representing a version of the text. Implement methods for:**
// - adding text to the editor: addText(String text)
// - undoing changes: undo()
// - getting the current text: getCurrentText()

public class Task6 {
    public static void main(String[] args) {

        TextEditor t1 = new TextEditor();
        t1.addText("hello");
        t1.addText("hi");
        System.out.println(t1.getCurrentText());

    }
}

class TextEditor {
    String[] stack_arr;

    TextEditor() {
        stack_arr = new String[0];

    }

    public void addText(String text) {
        String[] new_stack_arr = new String[this.stack_arr.length + 1];

        for (int i = 0; i < this.stack_arr.length; i++) {
            new_stack_arr[i] = this.stack_arr[i];
        }
        new_stack_arr[new_stack_arr.length - 1] = text;
        this.stack_arr = new_stack_arr;
    }

    public void undo() {
        String[] new_stack_arr = new String[this.stack_arr.length - 1];
        for (int i = 0; i < new_stack_arr.length; i++) {
            new_stack_arr[i] = this.stack_arr[i];
        }
        this.stack_arr = new_stack_arr;

    }

    public String getCurrentText() {
        return this.stack_arr[this.stack_arr.length - 1];
    }
}