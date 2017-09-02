module pattern.nine.facade {
    requires transitive module.one;
    requires transitive module.two;
    exports pattern.nine.external;
}