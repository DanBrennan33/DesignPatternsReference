package command.pattern.demo;

public class CommandPatternEx {
    public static void main(String[] args) {
        System.out.println("***COMMAND PATTERN DEMO***\n");
        Receiver r = new Receiver();
        Invoke inv = new Invoke();

        MyUndoCommand unCmd = new MyUndoCommand(r);
        MyRedoCommand reCmd = new MyRedoCommand(r);

        inv.ExecuteCommand(unCmd);
        inv.ExecuteCommand(reCmd);
    }
}
