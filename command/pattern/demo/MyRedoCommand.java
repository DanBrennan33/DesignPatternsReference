package command.pattern.demo;

public class MyRedoCommand implements ICommand {
    private Receiver receiver;
    MyRedoCommand(Receiver rec) {
        receiver = rec;
    }

    @Override
    public void Do() {
        receiver.performRedo();
    }
}
