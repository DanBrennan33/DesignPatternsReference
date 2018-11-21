package command.pattern.demo;

public class MyUndoCommand implements ICommand {
    private Receiver receiver;
    MyUndoCommand(Receiver rec) {
        receiver = rec;
    }

    @Override
    public void Do() {
        receiver.performUndo();
    }
}
