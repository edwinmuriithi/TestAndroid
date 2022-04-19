
package com.moringaschool.android_ip_1.Models.SearchEndPoint;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.parceler.Generated;
import org.parceler.IdentityCollection;
import org.parceler.ParcelWrapper;
import org.parceler.ParcelerRuntimeException;

@Generated("org.parceler.ParcelAnnotationProcessor")
@SuppressWarnings({
    "unchecked",
    "deprecation"
})
public class SearchArrayObject$$Parcelable
    implements Parcelable, ParcelWrapper<com.moringaschool.android_ip_1.Models.SearchEndPoint.SearchArrayObject>
{

    private com.moringaschool.android_ip_1.Models.SearchEndPoint.SearchArrayObject searchArrayObject$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Creator<SearchArrayObject$$Parcelable>CREATOR = new Creator<SearchArrayObject$$Parcelable>() {


        @Override
        public SearchArrayObject$$Parcelable createFromParcel(android.os.Parcel parcel$$2) {
            return new SearchArrayObject$$Parcelable(read(parcel$$2, new IdentityCollection()));
        }

        @Override
        public SearchArrayObject$$Parcelable[] newArray(int size) {
            return new SearchArrayObject$$Parcelable[size] ;
        }

    }
    ;

    public SearchArrayObject$$Parcelable(com.moringaschool.android_ip_1.Models.SearchEndPoint.SearchArrayObject searchArrayObject$$2) {
        searchArrayObject$$0 = searchArrayObject$$2;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$0, int flags) {
        write(searchArrayObject$$0, parcel$$0, flags, new IdentityCollection());
    }

    public static void write(com.moringaschool.android_ip_1.Models.SearchEndPoint.SearchArrayObject searchArrayObject$$1, android.os.Parcel parcel$$1, int flags$$0, IdentityCollection identityMap$$0) {
        int identity$$0 = identityMap$$0 .getKey(searchArrayObject$$1);
        if (identity$$0 != -1) {
            parcel$$1 .writeInt(identity$$0);
        } else {
            parcel$$1 .writeInt(identityMap$$0 .put(searchArrayObject$$1));
            parcel$$1 .writeString(searchArrayObject$$1 .image);
            parcel$$1 .writeString(searchArrayObject$$1 .id);
            parcel$$1 .writeString(searchArrayObject$$1 .title);
        }
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.moringaschool.android_ip_1.Models.SearchEndPoint.SearchArrayObject getParcel() {
        return searchArrayObject$$0;
    }

    public static com.moringaschool.android_ip_1.Models.SearchEndPoint.SearchArrayObject read(android.os.Parcel parcel$$3, IdentityCollection identityMap$$1) {
        int identity$$1 = parcel$$3 .readInt();
        if (identityMap$$1 .containsKey(identity$$1)) {
            if (identityMap$$1 .isReserved(identity$$1)) {
                throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
            }
            return identityMap$$1 .get(identity$$1);
        } else {
            com.moringaschool.android_ip_1.Models.SearchEndPoint.SearchArrayObject searchArrayObject$$4;
            int reservation$$0 = identityMap$$1 .reserve();
            searchArrayObject$$4 = new com.moringaschool.android_ip_1.Models.SearchEndPoint.SearchArrayObject();
            identityMap$$1 .put(reservation$$0, searchArrayObject$$4);
            searchArrayObject$$4 .image = parcel$$3 .readString();
            searchArrayObject$$4 .id = parcel$$3 .readString();
            searchArrayObject$$4 .title = parcel$$3 .readString();
            com.moringaschool.android_ip_1.Models.SearchEndPoint.SearchArrayObject searchArrayObject$$3 = searchArrayObject$$4;
            identityMap$$1 .put(identity$$1, searchArrayObject$$3);
            return searchArrayObject$$3;
        }
    }

}
