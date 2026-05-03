// Referential equality checks whether two variables point to the same object in memory. The === operator is used to determine this:

// x === y    // true only if x and y refer to the same object instance
// The inverse operator !== checks if two references point to different instances. For types that are compiled to primitive types (like Int, Double, etc.), the === and !== operators may behave like == and !=, since primitives don't have object identity in the same way.