# About

The prototype pattern.

Use the `clone()` method to make a copy of an existing object instead of creating new ones from scratch.

The to be cloned object's class must implement the `Clonable` interface.

For complex objects, the `clone()` method needs to implement the deep clone/copy otherwise a shallow copy
such as a pointer instead of the object will be cloned.