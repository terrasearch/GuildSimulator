package at.englert.bertram.guildsimulator.viewmodel;

public interface IPropertyChangedListener {
    void onPropertyChanged();

    void onPropertyChanged(String identifier);
}
