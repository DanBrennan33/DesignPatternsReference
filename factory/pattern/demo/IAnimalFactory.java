package factory.pattern.demo;

abstract class IAnimalFactory {
    public abstract IAnimal GetAnimalType(String type) throws Exception;

}
