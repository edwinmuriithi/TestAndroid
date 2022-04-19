
package com.moringaschool.android_ip_1.Models.FilmEndPoint;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.parceler.Generated;
import org.parceler.IdentityCollection;
import org.parceler.InjectionUtil;
import org.parceler.ParcelWrapper;
import org.parceler.ParcelerRuntimeException;

@Generated("org.parceler.ParcelAnnotationProcessor")
@SuppressWarnings({
    "unchecked",
    "deprecation"
})
public class Trailer$$Parcelable
    implements Parcelable, ParcelWrapper<com.moringaschool.android_ip_1.Models.FilmEndPoint.Trailer>
{

    private com.moringaschool.android_ip_1.Models.FilmEndPoint.Trailer trailer$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Creator<Trailer$$Parcelable>CREATOR = new Creator<Trailer$$Parcelable>() {


        @Override
        public Trailer$$Parcelable createFromParcel(android.os.Parcel parcel$$2) {
            return new Trailer$$Parcelable(read(parcel$$2, new IdentityCollection()));
        }

        @Override
        public Trailer$$Parcelable[] newArray(int size) {
            return new Trailer$$Parcelable[size] ;
        }

    }
    ;

    public Trailer$$Parcelable(com.moringaschool.android_ip_1.Models.FilmEndPoint.Trailer trailer$$2) {
        trailer$$0 = trailer$$2;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$0, int flags) {
        write(trailer$$0, parcel$$0, flags, new IdentityCollection());
    }

    public static void write(com.moringaschool.android_ip_1.Models.FilmEndPoint.Trailer trailer$$1, android.os.Parcel parcel$$1, int flags$$0, IdentityCollection identityMap$$0) {
        int identity$$0 = identityMap$$0 .getKey(trailer$$1);
        if (identity$$0 != -1) {
            parcel$$1 .writeInt(identity$$0);
        } else {
            parcel$$1 .writeInt(identityMap$$0 .put(trailer$$1));
            parcel$$1 .writeString(InjectionUtil.getField(java.lang.String.class, com.moringaschool.android_ip_1.Models.FilmEndPoint.Trailer.class, trailer$$1, "link"));
            parcel$$1 .writeString(InjectionUtil.getField(java.lang.String.class, com.moringaschool.android_ip_1.Models.FilmEndPoint.Trailer.class, trailer$$1, "id"));
        }
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.moringaschool.android_ip_1.Models.FilmEndPoint.Trailer getParcel() {
        return trailer$$0;
    }

    public static com.moringaschool.android_ip_1.Models.FilmEndPoint.Trailer read(android.os.Parcel parcel$$3, IdentityCollection identityMap$$1) {
        int identity$$1 = parcel$$3 .readInt();
        if (identityMap$$1 .containsKey(identity$$1)) {
            if (identityMap$$1 .isReserved(identity$$1)) {
                throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
            }
            return identityMap$$1 .get(identity$$1);
        } else {
            com.moringaschool.android_ip_1.Models.FilmEndPoint.Trailer trailer$$4;
            int reservation$$0 = identityMap$$1 .reserve();
            trailer$$4 = new com.moringaschool.android_ip_1.Models.FilmEndPoint.Trailer();
            identityMap$$1 .put(reservation$$0, trailer$$4);
            InjectionUtil.setField(com.moringaschool.android_ip_1.Models.FilmEndPoint.Trailer.class, trailer$$4, "link", parcel$$3 .readString());
            InjectionUtil.setField(com.moringaschool.android_ip_1.Models.FilmEndPoint.Trailer.class, trailer$$4, "id", parcel$$3 .readString());
            com.moringaschool.android_ip_1.Models.FilmEndPoint.Trailer trailer$$3 = trailer$$4;
            identityMap$$1 .put(identity$$1, trailer$$3);
            return trailer$$3;
        }
    }

}
