import java.util.Set;

public interface Validator<T> {
    void validate(T model);

    boolean hasValidationErrors();

    Set<ValidationError> getValidationErrors();
}
