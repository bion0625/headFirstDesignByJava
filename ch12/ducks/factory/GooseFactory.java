package ch12.ducks.factory;

import ch12.ducks.Goose;

public class GooseFactory extends AbstractGooseFactory{
    Goose createGoose() {
        return new Goose();
    }
}
