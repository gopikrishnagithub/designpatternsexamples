package com.abstractfactory;

public interface OSFactory {

    Phone create(ManufacturerType manufacturerType);
}
