package factory.pattern.demo;

public class FactoryPatternEx {
    public static void main(String[] args) throws Exception {
        System.out.println("***FACTORY PATTERN DEMO***\n");
        IAnimalFactory animalFactory = new ConcreteFactory();
        IAnimal DuckType = animalFactory.GetAnimalType("Duck");
        DuckType.Speak();

        IAnimal TigerType = animalFactory.GetAnimalType("Tiger");
        TigerType.Speak();


        IAnimal LionType = animalFactory.GetAnimalType("Lion");
        LionType.Speak();
    }
}
