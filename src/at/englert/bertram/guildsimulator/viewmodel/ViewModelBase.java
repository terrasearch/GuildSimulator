package at.englert.bertram.guildsimulator.viewmodel;

import at.englert.bertram.guildsimulator.model.ModelBase;

import java.util.ArrayList;
import java.util.List;

public class ViewModelBase<T extends ModelBase> implements IProperty {
    private final T model;
    private final List<IPropertyChangedListener> changedListeners = new ArrayList<>();

    public ViewModelBase(T model) {
        this.model = model;
    }

    protected T getModel() {
        return model;
    }

    public void registerPropertyChangedListener(IPropertyChangedListener changedListener) {
        changedListeners.add(changedListener);
    }

    @Override
    public void propertyChanged() {
        changedListeners.forEach(IPropertyChangedListener::onPropertyChanged);
    }

    @Override
    public void propertyChanged(String identifier) {
        changedListeners.forEach(listener -> listener.onPropertyChanged(identifier));
    }
}
