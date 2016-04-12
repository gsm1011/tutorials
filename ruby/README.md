# Introduction

A short tutorial of the ruby programming language.

## Syntax 

### Variables

- Local variables start with a lower case letter or underscore `_`.
- Instance variables start with a `@` symbol. 
- Class variables start with the `@@` symbol. 
- Global variables start with the `$` symbol. 
- Using `::` to refer to a constant within a module or class.

### Comparisons

- `==` value comparison
- `===` case comparison
- `eql?` hash key comparison, almost identical to `==`
- `equal?` identity (pointer) comparison, `true` when comparing the same object, `false` otherwise.

### Comments

- Single comment: `#`. 
- Block comment starts with `=begin` and close by `=end` in separate lines. 

### Control structures

- `begin ... end until <condition>`
- `begin ... rescue retry end`
