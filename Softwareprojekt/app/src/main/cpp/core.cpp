#include <jni.h>
#include <string>

extern "C" { // <-- very important!
#include "point_448.h"
}

#include <iomanip>
#include <sstream>

inline void key_from_hex_str(uint8_t out[X448_PUBLIC_BYTES], const std::string& hex)
{
    assert(hex.size() == 2 * X448_PUBLIC_BYTES);
    uint8_t pos;
    uint8_t idx0;
    uint8_t idx1;

    // mapping of ASCII characters to hex values
    const uint8_t hashmap[] = {
        0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, // 01234567
        0x08, 0x09, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, // 89:;<=>?
        0x00, 0x0a, 0x0b, 0x0c, 0x0d, 0x0e, 0x0f, 0x00, // @ABCDEFG
        0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, // HIJKLMNO
    };

    for (unsigned int pos = 0; pos + 1 < hex.size(); pos += 2) {
        idx0 = ((uint8_t)hex[pos + 0] & 0x1F) ^ 0x10;
        idx1 = ((uint8_t)hex[pos + 1] & 0x1F) ^ 0x10;
        out[pos / 2] = (uint8_t)(hashmap[idx0] << 4) | hashmap[idx1];
    };
}

inline std::string key_to_hex_str(uint8_t key[X448_PUBLIC_BYTES])
{
    std::stringstream ss;
    ss << std::hex;

    for (unsigned int i = 0; i < X448_PUBLIC_BYTES; ++i) {
        ss << std::setw(2) << std::setfill('0') << (unsigned int)key[i];
    }

    return ss.str();
}

extern "C" JNIEXPORT jstring JNICALL
Java_com_swp_hydra_GUIActivity_stringFromJNI(
    JNIEnv* env,
    jobject /* this */)
{
    uint8_t sk[X448_PRIVATE_BYTES];
    uint8_t pk[X448_PUBLIC_BYTES];

    std::string sk_hex = "9a8f4925d1519f5775cf46b04b5800d4ee9ee8bae8bc5565d498c28dd9c9baf574a9419744897391006382a6f127ab1d9ac2d8c0a598726b";
    key_from_hex_str(sk, sk_hex);
    x448_derive_public_key(pk, sk);
    return env->NewStringUTF(key_to_hex_str(pk).c_str());
}
