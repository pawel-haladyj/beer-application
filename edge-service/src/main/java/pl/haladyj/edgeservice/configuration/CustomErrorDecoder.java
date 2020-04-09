package pl.haladyj.edgeservice.configuration;

import feign.Response;
import feign.codec.ErrorDecoder;
import pl.haladyj.edgeservice.exception.BadRequestException;
import pl.haladyj.edgeservice.exception.NotFoundException;

public class CustomErrorDecoder implements ErrorDecoder {
    @Override
    public Exception decode(String s, Response response) {
        switch (response.status()) {
            case 400:
                return new BadRequestException();
            case 404:
                return new NotFoundException();
            default:
                return new Exception("generic error");
        }
    }
}
