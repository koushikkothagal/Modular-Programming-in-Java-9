module pattern.two.implA {
    requires pattern.two.service;
    provides pattern.two.external.PublicInterface with pattern.two.implA.ImplA;
}