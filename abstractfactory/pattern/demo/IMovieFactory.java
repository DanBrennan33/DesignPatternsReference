package abstractfactory.pattern.demo;

public interface IMovieFactory {
	ITollywoodMovie GetTollywoodMovie();
	IBollywoodMovie GetBollywoodMovie();
}
