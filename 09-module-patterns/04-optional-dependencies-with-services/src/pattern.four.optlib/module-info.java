module pattern.four.optlib {
    requires pattern.four;
    provides pattern.four.external.LibInterface
        with pattern.four.lib.LibImpl; 
}