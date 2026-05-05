// x?.equals(y) ?: (y === null)
// This states that,

// If x is not null, it calls x.equals(y).
// If x is null, it checks if y is also null using referential equality (===).
// This means that == in Kotlin is null-safe and doesn't throw a NullPointerException.

// Note: To use ==, the class should override the equals() method. In Kotlin, data classes automatically generate equals() (and hashCode()) based on their properties.