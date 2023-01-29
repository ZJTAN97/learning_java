import com.google.auto.service.AutoService;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Set;
import static javax.lang.model.element.ElementKind.FIELD;


@AutoService(Processor.class)
@SupportedAnnotationTypes("*")
@SupportedSourceVersion(SourceVersion.RELEASE_17)
public class BuilderProcessor extends AbstractProcessor {

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {

        annotations.forEach(annotation ->
          roundEnv
            .getElementsAnnotatedWith(annotation)
            .forEach(this::generateBuilderFile)
        );

        return true;
    }

    private void generateBuilderFile(Element element) {

        String className = element.getSimpleName().toString();
        String packageName = element.getEnclosingElement().toString();
        String builderName = className + "Builder";
        String builderFullName = packageName + "." + builderName;
        List<? extends Element> fields = element.getEnclosedElements()
          .stream().filter(e -> FIELD.equals(e.getKind())).toList();

    }

}
