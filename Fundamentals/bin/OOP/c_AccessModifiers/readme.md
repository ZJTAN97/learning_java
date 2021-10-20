Access Modifiers are a specific part of programming language syntax used to facilitate the encapsulation of components

### Private access modifiers `Private`
- The methods or data members declared as private are accessible only within the class in which they are declared.
- Any other class of the same package will not be able to access these members.
- Top level classes or interfaces can not be declared as private because
    1. private means "only visible within the enclosing class."
    2. proctected means "only visible within the enclosing class and any subclasses."


### Protected access modifiers `Protected`
- The methods or data members declared as protected are accessible within the same package or subclasses in different packages.


### Public access modifiers `Public`
- Has the widest scope among all other access modifiers.
- accessible from everywhere.


### Default access modifiers `Default`
- Accessible only within the same package.