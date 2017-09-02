module pattern.two.implB {
    requires pattern.two.service;
    provides pattern.two.external.PublicInterface with pattern.two.implB.ImplB;
}