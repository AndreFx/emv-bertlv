package io.github.binaryfoo.decoders.apdu;

import io.github.binaryfoo.DecodedData;
import io.github.binaryfoo.decoders.DecodeSession;

public class PutDataAPDUDecoder implements CommandAPDUDecoder {
    @Override
    public APDUCommand getCommand() {
        return APDUCommand.PutData;
    }

    @Override
    public DecodedData decode(String input, int startIndexInBytes, DecodeSession session) {
        return new DecodedData("C-APDU: Put Data", "", startIndexInBytes, startIndexInBytes + 5);
    }
}
