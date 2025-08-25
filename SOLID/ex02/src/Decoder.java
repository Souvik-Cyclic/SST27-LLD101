public class Decoder {
    Frame decode(byte[] fileBytes) {
        return new Frame(fileBytes);
    }
}
