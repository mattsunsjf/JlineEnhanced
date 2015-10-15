Description
-----------

A fork of Jline2 https://github.com/jline/jline2


Enhancement
-------------

* StringAndFileNameCompleter: using Adapter Pattern to aggregate the functionality of StringsCompleter and FileNameCompleter
* Add "^C" after CTRL+C is caught. Mimic the behavior of system shell


Building
--------

### Requirements

* Maven 2+
* Java 5+

Check out and build:

    git clone https://github.com/mattsunsjf/jline2.git
    cd jline2
    mvn install

